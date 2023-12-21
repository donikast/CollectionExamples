package bg.tu_varna.sit.task.list_set;


public class Application {
    public static void main(String[] args) throws ArticleException {
        Blog blog = new Blog("Stamat Stamatov");

        Article article = new Article("Stamat", "Stamat", "Some title",
                "Some content");
        Article article2 = new Article("Pesho", "Stamat", "Some title2",
                "Some content");
        Article article3 = new Article("Panayot", "Stamat", "Some title3",
                "Some content");
        Article article4 = new Article("Pesho", "Stamat", "Some title4",
                "Some content");
        blog.addArticle(article);
        blog.addArticle(article2);
        blog.addArticle(article3);
        blog.addArticle(article4);
        Comment comment = new Comment("Statul", "Statul", "Some comment");
        blog.addComment("Some title", comment);
        blog.addComment("Some title", comment);
        blog.addComment("Some title3", comment);
        System.out.println(blog.getAuthorWithMaxArticles());
        System.out.println(blog.getAuthorWithMaxComments());
        System.out.println(blog.getAuthorWithMaxRevisions());

    }
}
