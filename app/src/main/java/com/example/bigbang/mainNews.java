package com.example.bigbang;

import java.util.ArrayList;

public class mainNews {
    private String status;
    private String totalResult;
    private ArrayList<APIMain> articles;


    public mainNews(String status,String totalResult,ArrayList<APIMain>articles) {
        this.status = status;
        this.totalResult = totalResult;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(String status) {
        this.totalResult = totalResult;
    }
    public ArrayList<APIMain>getArticles () {
        return articles;
    }

    public void setArticles(String status) {
        this.articles = articles;
    }
}
