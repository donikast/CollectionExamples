package bg.tu_varna.sit.task.original;

public class Version {
    private String creator;
    private String editor;

    public Version(String creator, String editor) throws VersionException {
        setCreator(creator);
        setEditor(editor);
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) throws VersionException {
        if(creator==null || creator.isEmpty()) {
            throw new VersionException("Created by cannot be null");
        }
        else {
            this.creator = creator;
        }
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) throws VersionException {
        if(editor==null || editor.isEmpty()) {
            throw new VersionException("Created by cannot be null");
        }
        else {
            this.editor = editor;
        }
    }
}
