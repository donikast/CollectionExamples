package bg.tu_varna.sit.task.list_set;

public class Version {
    private String creator;
    private String editor;

    public Version(String creator, String editor) {
        this.creator = creator;
        this.editor = editor;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}
