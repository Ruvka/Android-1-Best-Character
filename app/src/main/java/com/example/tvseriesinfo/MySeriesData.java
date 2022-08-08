package com.example.tvseriesinfo;

public class MySeriesData {

    private String seriesName;
    private String seriesDate;
    private Integer seriesImage;

    public MySeriesData(String seriesName, String seriesDate, Integer seriesImage) {
        this.seriesName = seriesName;
        this.seriesDate = seriesDate;
        this.seriesImage = seriesImage;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getSeriesDate() {
        return seriesDate;
    }

    public void setSeriesDate(String seriesDate) {
        this.seriesDate = seriesDate;
    }

    public Integer getSeriesImage() {
        return seriesImage;
    }

    public void setSeriesImage(Integer seriesImage) {
        this.seriesImage = seriesImage;
    }
}