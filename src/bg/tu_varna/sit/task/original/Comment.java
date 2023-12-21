package bg.tu_varna.sit.task.original;

public class Comment extends Version {
    private String content;


    public Comment(String creator, String editor, String content) throws VersionException, CommentException {
        super(creator, editor);
        this.setContent(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) throws CommentException{
        if(content==null || content.isEmpty()) {
            throw new CommentException("Comment cannot be empty");
        }
        else {
            this.content = content;
        }
    }
    }

