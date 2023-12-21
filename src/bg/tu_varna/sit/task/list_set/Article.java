package bg.tu_varna.sit.task.list_set;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Article extends Version {
    private String title;
    private String content;
    private List<Comment> commentList = new ArrayList<>();

    public Article(String creator, String editor, String title, String content) {
        super(creator, editor);
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
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

    public void addComment(Comment comment) {
        commentList.add(comment);
    }
}






