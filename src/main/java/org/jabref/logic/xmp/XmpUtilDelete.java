package org.jabref.logic.xmp;

public class XmpUtilDelete {
    String title;
    String author;
    String subject;
    String date;

    public XmpUtilDelete(String title, String author, String subject, String date) {
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.date = date;
    }

    public static boolean isPdf(String path) {
        if (path.endsWith(".pdf")) {
            return true;
        }

        return false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String DeleteField(int opcode) {

        if (opcode == 1) {
            setAuthor(null);
            return author;
        } else if (opcode == 2) {
            setTitle(null);
            return title;
        } else if (opcode == 3) {
            setSubject(null);
            return subject;
        } else {
            setDate(null);
            return date;
        }

    }

    @Override
    public String toString() {
        return "XmpUtilDelete{" +
                "title='" + title + "'" +
        ", author='" + author + "'" +
        ", subject='" + subject + "'" +
        ", date='" + date + "'" +
        "}";
    }
}
