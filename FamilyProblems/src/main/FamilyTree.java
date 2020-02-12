package main;

import java.util.ArrayList;

import static main.Main.marry;

public class FamilyTree {
    private String familyName;
    private FamilyMember maleAncestor;
    private FamilyMember femaleAncestor;

    public FamilyTree(String familyName)
    {
        this.familyName = familyName;
    }
    public FamilyTree( String familyName, FamilyMember maleRoot , FamilyMember femaleRoot)
    {
        this.familyName=familyName;
        maleAncestor = maleRoot;
        femaleAncestor = femaleRoot;
        marry(maleAncestor,femaleAncestor);
        maleAncestor.setMother(new FamilyMember("//"));
        maleAncestor.setFather(new FamilyMember("//"));
        femaleAncestor.setMother(new FamilyMember("//"));
        femaleAncestor.setFather(new FamilyMember("//"));
    }
    public void addRootParents(FamilyMember maleRoot , FamilyMember femaleRoot)
    {
        maleAncestor = maleRoot;
        femaleAncestor = femaleRoot;
        marry(maleAncestor,femaleAncestor);
    }

    public String getFamilyName() {
        return familyName;
    }

    public FamilyMember getFemaleAncestor() {
        return femaleAncestor;
    }

    public FamilyMember getMaleAncestor() {
        return maleAncestor;
    }
}
