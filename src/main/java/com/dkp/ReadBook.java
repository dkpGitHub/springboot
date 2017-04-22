package com.dkp;

import java.io.Serializable;

/**
 * Created by kunpeng on 2017/4/22.
 */
public class ReadBook implements Serializable {
    private static final long serialVersionUID = 4039865251063965180L;

    private Long id;

    /**
     * 图书类别
     */
    private String category;

    /**
     * 图书全称
     */
    private String nane;

    /**
     * 图书简称
     */
    private String shortName;

    /**
     * 作者
     */
    private String author;

    /**
     * 图书简介
     */
    private String bookDesc;

    /**
     * 阅读大致进度
     */
    private String progressBar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public String getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(String progressBar) {
        this.progressBar = progressBar;
    }
}
