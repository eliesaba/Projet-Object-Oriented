package project.weather;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@see Application
 * @author paulm
 */

import java.io.*;
import java.util.ArrayList;

/**
 *The result of this class is to take the informations from the csv file and to put it into an array list.
 * Then to get average of the selected items which the user will enter.
 * @author paulm
 */

public class readandaverage {
     
    public readandaverage(){};
    public static ArrayList<String> list=new ArrayList<String>();
    
 /**
 *Filling the list of informations into an array list.
 * @author paulm
 */

public void filllist(){
   try{
	 BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\paulm\\OneDrive\\Desktop\\project oo\\data.csv"));
	  String line;
	  br.readLine();
	while((line=br.readLine()) !=null )
	{	
            list.add(line);
	}
	br.close();
    }
catch(FileNotFoundException e1){
	System.exit(404);
}
catch(IOException e2)
{
	System.exit(500);
}
}

/**
 *It gets the average of an array list.
 * @author paulm
 */

public float average (ArrayList<String> avg) 
{
    float sum=0;
    for(int i=0 ; i < avg.size();i++){
        float a = Float.parseFloat(avg.get(i));
        sum=sum+a;    
    }
    return sum/avg.size();
}

/**
 * This class takes the informations from the user and calculates the average. 
 * Multiples cases for the user to choose.
 * @author paulm
 */

     public String getaverage(String year,String month,String day,String hour,boolean temp,boolean windspeed,boolean winddirect,boolean totalprec){
    ArrayList<String> datafilter = new ArrayList<>();
    
    if(!year.equals(" ") && !month.equals(" ") && day.equals(" ") && hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");

                if(year.equals(lineIndex[0]) && month.equals(lineIndex[1])  )
                {
                    if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            } 
            String s=Float.toString(average(datafilter));
            return s;            
        }  
    
        if(!year.equals(" ") && !month.equals(" ") && !day.equals(" ") && hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");

                if(year.equals(lineIndex[0]) && month.equals(lineIndex[1]) && day.equals(lineIndex[2]) )
                {
                    if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            }
            String s=Float.toString(average(datafilter));
            return s;
        }
    
        if(!year.equals(" ") && !month.equals(" ") && !day.equals(" ") && !hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");

                if(year.equals(lineIndex[0]) && month.equals(lineIndex[1]) && day.equals(lineIndex[2]) && hour.equals(lineIndex[3]))
                {
                    if(temp==true)
                    {
                        return lineIndex[5];
                    }
                    if(windspeed==true)
                    {
                        return lineIndex[7]; 
                    }
                    if(winddirect==true)
                    {
                        return lineIndex[8];
                    }
                    if(totalprec==true)
                    {
                        return lineIndex[6];
                    }
                }   
            } 
            String s=Float.toString(average(datafilter));
            return s;            
        }
        
	if(!year.equals(" ") && month.equals(" ") && day.equals(" ") && hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");
                if(year.equals(lineIndex[0]))
                {if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            }   
            String s=Float.toString(average(datafilter));
            return s;
        }
        
        if(year.equals(" ") && !month.equals(" ") && day.equals(" ") && hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");
                if(month.equals(lineIndex[1]))
                {if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            }   
            String s=Float.toString(average(datafilter));
            return s;
        }
        
        if(year.equals(" ") && month.equals(" ") && !day.equals(" ") && hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");
                if(day.equals(lineIndex[2]))
                {if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            }   
            String s=Float.toString(average(datafilter));
            return s;
        }
        
        if(year.equals(" ") && month.equals(" ") && day.equals(" ") && !hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");
                if(hour.equals(lineIndex[3]))
                {if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            }   
            String s=Float.toString(average(datafilter));
            return s;
        }
        
        if(year.equals(" ") && !month.equals(" ") && !day.equals(" ") && hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");
                if(month.equals(lineIndex[1]) && day.equals(lineIndex[2]))
                {if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            }   
            String s=Float.toString(average(datafilter));
            return s;
        }
        
        if(!year.equals(" ") && month.equals(" ") && !day.equals(" ") && hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");
                if(year.equals(lineIndex[0]) && day.equals(lineIndex[2]))
                {if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            }   
            String s=Float.toString(average(datafilter));
            return s;
        }
        
        if(!year.equals(" ") && month.equals(" ") && day.equals(" ") && !hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");
                if(year.equals(lineIndex[0]) && hour.equals(lineIndex[3]))
                {if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            }   
            String s=Float.toString(average(datafilter));
            return s;
        }
        
        if(year.equals(" ") && !month.equals(" ") && day.equals(" ") && !hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");
                if(month.equals(lineIndex[1]) && hour.equals(lineIndex[3]))
                {if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            }   
            String s=Float.toString(average(datafilter));
            return s;
        }
        
        if(year.equals(" ") && !month.equals(" ") && !day.equals(" ") && !hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");

                if(month.equals(lineIndex[1]) && day.equals(lineIndex[2]) && hour.equals(lineIndex[3]) )
                {
                    if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            }
            String s=Float.toString(average(datafilter));
            return s;
        }      
        
        if(year.equals(" ") && month.equals(" ") && !day.equals(" ") && !hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");

                if(day.equals(lineIndex[2]) && hour.equals(lineIndex[3]) )
                {
                    if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            }
            String s=Float.toString(average(datafilter));
            return s;
        }
        
        if(!year.equals(" ") && !month.equals(" ") && day.equals(" ") && !hour.equals(" "))
        {
            for(int i=0;i<list.size();i++){
                String lineIndex[] = list.get(i).split(",");

                if(year.equals(lineIndex[0]) && month.equals(lineIndex[1]) && hour.equals(lineIndex[3]) )
                {
                    if(temp==true)
                    {
                        datafilter.add(lineIndex[5]);
                    }
                    if(windspeed==true)
                    {
                        datafilter.add(lineIndex[7]);
                    }
                    if(winddirect==true)
                    {
                        datafilter.add(lineIndex[8]);
                    }
                    if(totalprec==true)
                    {
                       datafilter.add(lineIndex[6]);
                    }
                }   
            }
            String s=Float.toString(average(datafilter));
            return s;
        }
        
        return null;
}

}
    
    

