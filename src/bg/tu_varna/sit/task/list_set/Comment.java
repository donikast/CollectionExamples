package bg.tu_varna.sit.task.list_set;

import java.util.Objects;

public class Comment extends Version{
    private String content;

    public Comment(String creator, String editor, String content) {
        super(creator, editor);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(content, comment.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}
