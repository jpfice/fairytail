package test.aaa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person implements Cloneable{

    private String name = "";

    private int age = 0;

    private List<String> pList = new ArrayList<String>();

    private Map<String, String> pMap= new HashMap<String, String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getpList() {
        return pList;
    }

    public void setpList(List<String> pList) {
        this.pList = pList;
    }

    public Map<String, String> getpMap() {
        return pMap;
    }

    public void setpMap(Map<String, String> pMap) {
        this.pMap = pMap;
    }

    public Object clone() {

        Object o = null;
        try {
            o = (Object) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", pList=" + pList + ", pMap=" + pMap + "]";
    }

}
