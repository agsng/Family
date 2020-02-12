package main;

import java.util.ArrayList;
import static main.Main.map;
public class RelationsFunctions {
   public static void printt(ArrayList<FamilyMember> arr)
   {
       for(int i =0;i<arr.size();i++)
       {
           System.out.print(arr.get(i).name + " ");
       }
       System.out.println();
   }
    public void getRelationship(String name, String relationship) {

        FamilyMember familyMember = map.get(name);

        switch (relationship){
            case "Paternal-Uncle":
            { getPaternalUncle(familyMember);break;}
            case "Maternal-Uncle":
            {getMaternalUncle(familyMember);break;}
            case "Paternal-Aunt":
            { getPaternalAunt(familyMember);break;}
            case "Maternal-Aunt":
            { getMaternalAunt(familyMember);break;}
            case "Sister-In-Law":
            { getSisterInLaw(familyMember);break;}
            case "Brother-In-Law":
            {getBrotherInLaw(familyMember);break;}
            case "Son":
            {getSon(familyMember);break;}
            case "Daughter":
            { getDaughter(familyMember);break;}
            case "Siblings":
            {break;}//printt( familyMember.getSiblings());

        }

    }

    private void getPaternalUncle(FamilyMember fm)
    {
        ArrayList<FamilyMember> outputt = new ArrayList<>();
        FamilyMember father = fm.getFather();
        //System.out.println(mom.name);
        ArrayList<FamilyMember>  siblingsOfFather = father.getSiblings();
        for(int i=0;i< siblingsOfFather.size();i++)
        {
            if(siblingsOfFather.get(i).getGender()=="M")
                outputt.add(siblingsOfFather.get(i));
        }
        printt(outputt);
    }
    private void getPaternalAunt(FamilyMember fm) // buaa
    {   ArrayList<FamilyMember> outputt = new ArrayList<>();
        FamilyMember father = fm.getFather();
        ArrayList<FamilyMember>  siblingsOfFather = father.getSiblings();
        //printt(siblingsOfFather);
        for(int i=0;i< siblingsOfFather.size();i++)
        {
            if(siblingsOfFather.get(i).getGender()=="F")
                outputt.add(siblingsOfFather.get(i));
        }
        printt(outputt);
    }
    private void getMaternalUncle(FamilyMember fm)
    {
        ArrayList<FamilyMember> outputt = new ArrayList<>();
        FamilyMember mother = fm.getMother();
        ArrayList<FamilyMember>  siblingsOfMother = mother.getSiblings();
        for(int i=0;i< siblingsOfMother.size();i++)
        {
            if(siblingsOfMother.get(i).getGender()=="M")
                outputt.add(siblingsOfMother.get(i));
        }
        printt(outputt);
    }
    private void getMaternalAunt(FamilyMember fm)
    {
        ArrayList<FamilyMember> outputt = new ArrayList<>();
        FamilyMember mother = fm.getMother();
        ArrayList<FamilyMember>  siblingsOfMother = mother.getSiblings();

        for(int i=0;i< siblingsOfMother.size();i++)
        {
            try
            {
                FamilyMember spouse = siblingsOfMother.get(i).getSpouse();
                if(siblingsOfMother.get(i).getGender()=="M")
                    outputt.add(siblingsOfMother.get(i).getSpouse());
            }
            catch (Exception e)
            {
            }

        }
        printt(outputt);
    }
    private void getSisterInLaw(FamilyMember fm)
    {
        ArrayList<FamilyMember> outputt = new ArrayList<>();
        FamilyMember spouse = fm.getSpouse();
        ArrayList<FamilyMember>  siblingsOfSpouse = spouse.getSiblings();
        for(int i=0;i< siblingsOfSpouse.size();i++)
        {
            if(siblingsOfSpouse.get(i).getGender()=="F")
                outputt.add(siblingsOfSpouse.get(i));
        }

        printt(outputt);
    }
    private void getBrotherInLaw(FamilyMember fm)
    {
        ArrayList<FamilyMember> outputt = new ArrayList<>();
        FamilyMember spouse = fm.getSpouse();
        ArrayList<FamilyMember>  siblingsOfSpouse = spouse.getSiblings();

        for(int i=0;i< siblingsOfSpouse.size();i++)
        {
            if(siblingsOfSpouse.get(i).getGender()=="M")
                outputt.add(siblingsOfSpouse.get(i));
        }
        printt(outputt);
    }
    private void getSon( FamilyMember fm)
    {
        ArrayList<FamilyMember> outputt = new ArrayList<>();
        ArrayList<FamilyMember> children = fm.getChildren();

        for(int i=0;i< children.size();i++)
        {
            if(children.get(i).getGender()=="M")
                outputt.add(children.get(i));
        }

        printt(outputt);
    }
    private void getDaughter(FamilyMember fm)
    {
        ArrayList<FamilyMember> outputt = new ArrayList<>();
        ArrayList<FamilyMember> children = fm.getChildren();

          for(int i=0;i< children.size();i++)
        {
            if(children.get(i).getGender()=="F")
                outputt.add(children.get(i));
        }
       printt(outputt);
    }

}
