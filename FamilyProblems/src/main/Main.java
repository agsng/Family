package main;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static HashMap<String,FamilyMember> map = new HashMap<>();

            public static void marry(FamilyMember male , FamilyMember female)
            {
                male.setSpouse(female);
                female.setSpouse(male);
                male.setChildren(female.getChildren());
                ArrayList<FamilyMember> children = male.getChildren();
                for(int i =0;i<children.size();i++)
                {
                    children.get(i).setFather(male);
                }
    }

    public static void main(String[] args) {

        FamilyTree Sew = new FamilyTree("Sew");

        FamilyMember maleRoot = new FamilyMember(" King Shan", "M" , Sew);
        FamilyMember femaleRoot = new FamilyMember("Queen Anga", "F", Sew);
        map.put("King Shan" ,maleRoot);
        map.put("Queen Anga" , femaleRoot);
        Sew.addRootParents(maleRoot,femaleRoot);


        ConstructFamily SewFamily  = new ConstructFamily(Sew);
        File file=new File("C:\\Users\\SG0307820\\Desktop\\" +
                "Initializing a RESTful Web Service with Spring Boot\\FamilyProblems\\src\\main\\input");
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line;
            while ((line=br.readLine())!=null)
            {
                String[] words=line.trim().split(" ");

                        String name=words[1].trim();
                        String relationship=words[2].trim();
                        RelationsFunctions rf = new RelationsFunctions();
                        System.out.print(name+"     "+relationship+ "    " );
                        rf.getRelationship(name,relationship);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



     }


}

