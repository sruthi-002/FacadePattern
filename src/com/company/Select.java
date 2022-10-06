package com.company;
public class Select {
    private Shop Iphone;
    private Shop Samsung;
    Iphone i = new Iphone();
    Samsung s =new Samsung();
    public void iphonesale(){
        i.modelNo();
        i.price();
    }
    public void samsungsale(){
        s.modelNo();
        s.price();
    }
}
