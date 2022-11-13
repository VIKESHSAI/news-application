package com.example.bigbang;

public class APIMain {

    private String author,title,descripton,url,urlToImage,publishedAt;


    public APIMain(String author, String title, String descripton, String url, String urlToImage, String publishedAt) {
        this.author = author;
        this.title  = title;
        this.title  = descripton;
        this.title  = url;
        this.title  = urlToImage;
        this.title  = publishedAt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String author) {
        this.title = title;
    }
    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String author) {
        this.descripton = descripton;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String author) {
        this.url = url;
    }
    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String author) {
        this.urlToImage = urlToImage;
    }
    public String getPublishedAt() {
        return author;
    }

    public void setPublishedAt(String author) {
        this.publishedAt = publishedAt;
    }
}
