package com;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
public class Insurancepolicy {

public static void main(String[] args) {
    String pcy="src/input.txt";

    public static void Insurancepolicy(List<policy> l1) throws Myexception
      for(policy pl:l1)
      {
        SimpleDateFormat l2=new SimpleDateFormat("dd/mm/yyyy");

        Date policy1=l2.parse(pl.getExpirydate());
        Date policy2.parse(pl.getCurrentdate());

            if(policy1.compareTo(policy1)<0)
                {
                    System.out.println("the policy "+pl.getKeyvalue()+" is Expired");

      }
      }


}
    public static void Insurancepolicy_file(List<Policy> file)throws NewException
    {
        List<policy> list1=new ArrayList<>();
        List<policy> list2=new ArrayList<>();
        insuranceamt=0;
         try
         {
             BufferedReader s=new BufferedReader(new FileReader(file));

             String ins;
            ins=s.readLine();
             while(ins!=null)
             {
                 String[] z =ins.split("  ");
                 policy t=new policy(x[0], x[1] ,x[2], x[3], x[4], x[5]);
                 replaceAll("^[A-z]"," ");
                 list1.add(t);
                 ins=s.readLine();

             }
         }
         catch(IOException ik)
         {
             ik.printStackTrace();
         }

    for(String i:list2)
        {
            for(policy j:list1)
            {
            if(j.policy_no().substring(0,2))
                {
                insuranceamt=insuranceamt+j.getCost_of_policy();
                }
            }
            System.out.println(insuranceamt);
        }
    }
}
