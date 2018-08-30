package com.example.shara.newsapps1;

public class News {
    String name;
    String id;
    String webtit;
    String url;

    public  News(String na,String i,String webti,String ur){
        name=na;
        id=i;
        webtit=webti;
        url=ur;


    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWebtit() {
        return webtit;
    }

    public String getUrl() {
        return url;
    }
}
