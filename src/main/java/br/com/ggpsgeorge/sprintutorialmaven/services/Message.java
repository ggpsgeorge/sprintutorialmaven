package br.com.ggpsgeorge.sprintutorialmaven.services;

public class Message {
    
    private String message;
    private int age;

    public Message(String message, int age){
        this.message = message;
        this.age = age;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
