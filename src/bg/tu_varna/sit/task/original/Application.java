package bg.tu_varna.sit.task.original;

public class Application {
    public static void main(String[] args) {
        Blog blog = new Blog("Stamat Stamatov");

        try {
            Article article = new Article("Stamat", "Stamat", "Some title",
                    "Some content");
            blog.addArticle(article);

            Comment comment = new Comment("Statul", "Statul", "Some comment");
            blog.addComment("Some title", comment);

        } catch (VersionException | ArticleException | CommentException e) {
            System.out.println(e.getMessage());
        }
    }
}
