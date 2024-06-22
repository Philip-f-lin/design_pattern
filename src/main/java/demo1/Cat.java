package demo1;

public class Cat {
    private String name = "";
    private int shoutNum = 3;



    public Cat(String name, int shoutNum){
        this.name = name;
        this.shoutNum = shoutNum;
    }

    public int setShoutNum(int shoutNum){
        return this.shoutNum = shoutNum;
    }



    public String shout(){
        String result = "";
        for (int i = 0 ; i < this.shoutNum ; i++){
            result += "喵 ";
        }
        return "我的名字叫" + name + result;
    }
}
