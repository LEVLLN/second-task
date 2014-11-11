package entity.bookstore;

public class Authors {
    int author_Id;
    int bookId;

    public int getAuthor_Id() {
        return author_Id;
    }

    public void setAuthorId(int authorId) {
        this.author_Id = authorId;
    }

    public int getBook_Id() {
        return bookId;
    }

    @Override
    public String toString() {
        return "Author:[" + "bookId='" + bookId + '\'' +
                ",authorId=" + author_Id + '}' + "]" + '\n';
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
