package com.socket;

import java.io.Serializable;
import java.math.BigInteger;

public class Message implements Serializable{
    
    private static final long serialVersionUID = 1L;
    public String type, sender, content, recipient;
    public BigInteger e, N;
     byte[] chiffre;
    public Message(String type, String sender, String content, String recipient){
        this.type = type; this.sender = sender; this.content = content; this.recipient = recipient;
    }
    public Message(String type,BigInteger e, BigInteger N , String sender, String content, String recipient){
         this.type = type;
        this.e = e; 
        this.N=N;
        this.sender = sender;
        this.content = content; 
        this.recipient = recipient;
    }
     public Message(String type, String sender, byte[] content, String recipient){
          this.type = type; this.sender = sender; this.chiffre = content; this.recipient = recipient;
    }
    public String toString(){
        return "{type='"+type+"', sender='"+sender+"', content='"+content+"', recipient='"+recipient+"'}";
    }
}
