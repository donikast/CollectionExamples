package bg.tu_varna.sit.task.original;

import java.util.Objects;

public class Article extends Version{
    private String title;
    private String content;
    private Comment[] comments = new Comment[50];


    public Article(String creator, String editor, String title, String content) throws VersionException, ArticleException {
        super(creator, editor);
        setTitle(title);
        setContent(content);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws ArticleException{
        if(title==null || title.isEmpty()) {
            throw new ArticleException("Article title cannot be empty");
        }
        else {
            this.title = title;
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) throws ArticleException {
        if(content==null || content.isEmpty()) {
            throw new ArticleException("Article content cannot be empty");
        }
        else {
            this.content = content;
        }
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) throws ArticleException{
        if(comments==null) {
            throw new ArticleException("Comment cannot be null");
        }
        else {
            this.comments = comments;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(title, article.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
