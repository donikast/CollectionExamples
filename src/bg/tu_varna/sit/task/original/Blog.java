package bg.tu_varna.sit.task.original;

public class Blog {
    private String author;
    private Article[] articles = new Article[1000];

    public Blog(String author) {
        this.author = author;
    }

    public void addArticle(Article article) throws ArticleException {
        for (int i = 0; i < 1000; i++) {
            if (articles[i] == null) {
                articles[i] = article;
                break;
            }
        }
    }

    public void addComment(String title, Comment comment) throws CommentException, ArticleException {
        Article article = null;
        for (Article a : articles) {
            if (a == null) break;
            if (a.getTitle().equals(title)) {
                article = a;
                break;
            }
        }
        if (article == null) {
            throw new ArticleException("Missing article");
        } else {
            Comment[] comments = article.getComments();
            for (int i = 0; i < comments.length; i++) {
                if (comments[i] == null) {
                    comments[i] = comment;
                    break;
                }
                article.setComments(comments);
            }
        }
    }
}