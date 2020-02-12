package main;

import java.util.ArrayList;

import static main.Main.map;

public class FamilyMember {

    public String name;
    private FamilyMember father;
    private FamilyMember mother;
    private FamilyMember spouse;
    private ArrayList<FamilyMember> siblings = new ArrayList<>();
    private ArrayList<FamilyMember> children = new ArrayList<>();
    private String gender;
    private String familyName;


    public FamilyMember(String dead)
    {
            name = dead;

    }
    public FamilyMember( String married ,String name , String gender ,FamilyTree familyNameObj)
    {
        this.name = name ;
        this.gender = gender ;
        this.mother = new FamilyMember(" -- ");
        this.father = new FamilyMember("--");
        this.spouse = new FamilyMember("--");
        this.familyName = familyNameObj.getFamilyName();
    }
    public FamilyMember(String name , String gender ,FamilyTree familyNameObj)
    {
        this.name = name;
        this.gender  = gender ;
        this.familyName = familyNameObj.getFamilyName();
        map.put(name,this);
    }
    public FamilyMember(String name, String gender , FamilyMember father,
                        FamilyMember mother, FamilyTree familyNameObj)
    {
        this.name = name ;
        this.gender = gender ;
        this.mother = mother;
        this.father = father;
        this.familyName = familyNameObj.getFamilyName();
        map.put(name,this);
    }

    public void addChild(FamilyMember childobj)
    {
        FamilyMember mother = this;
        childobj.setMother(mother);

         if(children.size()>0)
         {   ArrayList<FamilyMember> brothers= (ArrayList<FamilyMember>)mother.children.clone();
             childobj.setSiblings(brothers);
             for(int i =0;i<children.size();i++)
             {
                 FamilyMember sibling = mother.children.get(i);
                 sibling.siblings.add(childobj);
             }
         }
         children.add(childobj);

    }

    public void setSpouse(FamilyMember spouse) {
        this.spouse = spouse;
    }

    public void setFather(FamilyMember father) {
        this.father = father;
    }

    public void setMother(FamilyMember mother) {
        this.mother = mother;
    }

    public ArrayList<FamilyMember> getChildren() {
        return children;
    }

    public ArrayList<FamilyMember> getSiblings() {
        return this.siblings;
    }

    public void setSiblings(ArrayList<FamilyMember> siblings) {
        this.siblings = siblings;
    }

    public FamilyMember getMother() {
        return mother;
    }

    public FamilyMember getFather() {
        return father;
    }

    public FamilyMember getSpouse() {
        return spouse;
    }

    public String getFamilyName() { return familyName; }

    public String getGender() { return gender; }

    public void setChildren(ArrayList<FamilyMember> children) {
        this.children = children;
    }
}
