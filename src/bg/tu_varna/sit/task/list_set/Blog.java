package bg.tu_varna.sit.task.list_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Blog {
    private String author;
    private static Set<Article> articleSet = new HashSet<>();

    public Blog(String author) {
        this.author = author;
    }


    public static Set<Article> getArticleSet() {
        return articleSet;
    }

    public void addArticle(Article article) {
        articleSet.add(article);
    }



    public void addComment(String title, Comment comment) throws ArticleException {
        Article article = getArticleByTitle(title);
        if (article == null) {
            throw new ArticleException("Missing article");
        } else {
            article.addComment(comment);
            }
        }

    public void editArticle(Article oldArticle, Article updatedArticle) throws ArticleException {
        for (Article a : articleSet) {
            if (a.equals(oldArticle)) {
                a.setTitle(updatedArticle.getTitle());
                a.setContent(updatedArticle.getContent());
                a.setCommentList(updatedArticle.getCommentList());
                break;
            }
        }
    }

    public String getAuthorWithMaxComments() {
        if (!articleSet.isEmpty()) {
            List<Article> articleList = new ArrayList<>(articleSet);
            String mostCommentedAuthor = "";
            int mostComments = 0;
            for (int i = 0; i < articleList.size(); i++) {
                String author = articleList.get(i).getCreator();
                int countOfComments = 0;
                for (int j = 0; j < articleList.size(); j++) {
                    if (articleList.get(j).getCreator().equals(articleList.get(i).getCreator())) {
                        countOfComments += articleList.get(j).getCommentList().size();
                    }
                }
                if (countOfComments > mostComments) {
                    mostComments = countOfComments;
                    mostCommentedAuthor = articleList.get(i).getCreator();
                }
            }
            return mostCommentedAuthor;
        }
        return null;
}

    public String getAuthorWithMaxArticles() {
        if (!articleSet.isEmpty()) {
            List<Article> articleList = new ArrayList<>(articleSet);
            String mostActiveAuthor = "";
            int mostArticles = 0;
            for (int i = 0; i < articleList.size(); i++) {
                String author = articleList.get(i).getCreator();
                int countOfArticles = 0;
                for (int j = 0; j < articleList.size(); j++) {
                    if (articleList.get(j).getCreator().equals(articleList.get(i).getCreator())) {
                        countOfArticles++;
                    }
                }
                if (countOfArticles > mostArticles) {
                    mostArticles = countOfArticles;
                    mostActiveAuthor = articleList.get(i).getCreator();
                }
            }
            return mostActiveAuthor;
        }
        return null;
    }

    public String getAuthorWithMaxRevisions() {
        if (!articleSet.isEmpty()) {
            List<Article> articleList = new ArrayList<>(articleSet);
            String mostRevisedAuthor = "";
            int mostRevisions = 0;
            for (int i = 0; i < articleList.size(); i++) {
                String author = articleList.get(i).getCreator();
                int countOfRevisions = 0;
                for (int j = 0; j < articleList.size(); j++) {
                    if (articleList.get(j).getCreator().equals(articleList.get(i).getCreator())
                    && !articleList.get(j).getCreator().equals(articleList.get(j).getEditor())) {
                        countOfRevisions++;
                    }
                }
                if (countOfRevisions > mostRevisions) {
                    mostRevisions = countOfRevisions;
                    mostRevisedAuthor = articleList.get(i).getCreator();
                }
            }
            return mostRevisedAuthor;
        }
        return null;
    }


    private Article getArticleByTitle(String title) {
        if (!articleSet.isEmpty()) {
            for (Article a : articleSet) {
                if (a.getTitle().equals(title))
                    return a;
            }
        }
        return null;
    }
}
