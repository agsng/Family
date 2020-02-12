package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import static main.Main.map;
import static main.Main.marry;
import static main.RelationsFunctions.printt;

public class ConstructFamily {
    private FamilyTree obj;
    public ConstructFamily( FamilyTree obj)
    {
        this.obj = obj;

         defineFamilyMembersAndRelations();
    }
    private void defineFamilyMembersAndRelations() {

        FamilyMember A = new FamilyMember("A", "M", obj);
        FamilyMember B = new FamilyMember("B", "M", obj);
        FamilyMember C = new FamilyMember("C", "F", obj);
        FamilyMember D = new FamilyMember("D", "F", obj);
        FamilyMember E = new FamilyMember("E", "F", obj);
        FamilyMember F = new FamilyMember("F", "M", obj);
        FamilyMember G = new FamilyMember("G", "M", obj);
        FamilyMember H = new FamilyMember("H", "F", obj);
        FamilyMember I = new FamilyMember("I", "F", obj);
        FamilyMember J = new FamilyMember("J", "F", obj);
        FamilyMember K = new FamilyMember("K", "M", obj);
        FamilyMember L = new FamilyMember("L", "M", obj);
        FamilyMember M = new FamilyMember("M", "F", obj);
        FamilyMember N = new FamilyMember("N", "M", obj);
        FamilyMember O = new FamilyMember("O", "F", obj);
        FamilyMember P = new FamilyMember("P", "F", obj);

        //Define Relations

        FamilyMember femaleAncestor = obj.getFemaleAncestor();

        femaleAncestor.addChild(A);
        femaleAncestor.addChild(B);
        femaleAncestor.addChild(C);



        D.addChild(G);
        D.addChild(H);

        E.addChild(I);

        F.addChild(J);
        F.addChild(K);

        O.addChild(L);
        O.addChild(D);
        O.addChild(M);

        marry(N,O);
        marry(A,D);
        marry(B,E);
        marry(C,F);
        marry(L,P);

        FamilyMember memm = map.get("C");
//printt(memm.getChildren());
//System.out.println(C.getSpouse().name);
       }
    }





