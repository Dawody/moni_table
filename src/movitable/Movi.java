/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package movitable;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author dawod
 */
public class Movi implements Serializable{
    private int operation; //it is not colum . it's to detect the request type only
    private String title;
    
    private List<Date> release = new ArrayList<Date>();
    private List<String> category = new ArrayList<String>();
    private List<String> overview = new ArrayList<String>();
    private List<String> language = new ArrayList<String>();
    private List<String> company = new ArrayList<String>();
    private List<String> country = new ArrayList<String>();
    private List<Float> runtime = new ArrayList<Float>();
    private List<Float> popularity = new ArrayList<Float>();
    private List<Boolean> adult = new ArrayList<Boolean>();
    
    
    private String temp = "";
    private float tempf = 0;
    private boolean tempb = true;
    private String date = "";
    private Date tempd = new Date();
    private DateFormat formatter;
    private Float ff = new Float(0);
    private int again =0;
    
    public Movi(String title , int operation){
        this.title=title;
        this.operation = operation;
        
        //
        this.release.add(new Date());
        this.category.add("null");
        this.overview.add("null");
        this.language.add("null");
        this.company.add("null");
        this.country.add("null");
        this.runtime.add(ff);
        this.popularity.add(ff);
        this.adult.add(true);
        //
        
    }
    
//
////--------------------------------------------------------------------------------
    public void set_release() throws ParseException{
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("please type film release date[yyyy-mm-dd]:");
            date = scan.next();
            formatter = new SimpleDateFormat("yyyy-MM-dd");
            tempd = formatter.parse(date);
            release.add(tempd);
            System.out.println("do you want to entre another time stamp of release date?[1:0]");
            again = scan.nextInt();
        }while(again==1);
        
    }
    
    
    public void set_category(){
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("please type film category:");
            temp = scan.nextLine();
            category.add(temp);
            System.out.println("do you want to entre another time stamp of category?[1:0]");
            again = scan.nextInt();
        }while(again==1);
    }
    
    public void set_overview(){
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("please type film overview:");
            temp = scan.nextLine();
            overview.add(temp);
            System.out.println("do you want to entre another time stamp of overview?[1:0]");
            again = scan.nextInt();
        }while(again==1);
    }
    
    public void set_language(){
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("please type film language:");
            temp = scan.nextLine();
            language.add(temp);
            System.out.println("do you want to entre another time stamp of language?[1:0]");
            again = scan.nextInt();
        }while(again==1);
    }
    
    public void set_company(){
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("please type film company:");
            temp = scan.nextLine();
            company.add(temp);
            System.out.println("do you want to entre another time stamp of production company?[1:0]");
            again = scan.nextInt();
        }while(again==1);
    }
    
    public void set_country(){
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("please type film country:");
            temp = scan.nextLine();
            country.add(temp);
            System.out.println("do you want to entre another time stamp of production country?[1:0]");
            again = scan.nextInt();
        }while(again==1);
    }
    
    public void set_runtime(){
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("please type film runtime:");
            tempf = scan.nextFloat();
            runtime.add(tempf);
            System.out.println("do you want to entre another time stamp of runtime?[1:0]");
            again = scan.nextInt();
        }while(again==1);
    }
    
    public void set_adult(){
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("is this film for adults?[true or false]");
            tempb = scan.nextBoolean();
            adult.add(tempb);
            System.out.println("do you want to entre another time stamp of adult constraint?[1:0]");
            again = scan.nextInt();
        }while(again==1);
    }
    
    public void set_popularity(){
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("please type film popularity:");
            tempf = scan.nextFloat();
            popularity.add(tempf);
            System.out.println("do you want to entre another time stamp of popularity?[1:0]");
            again = scan.nextInt();
        }while(again==1);
    }
    
    
    
//-------------------------------------------------------------------------------
    public String get_row_key(){
        return this.title;
    }
    
    public List<Date> get_release(){
        return this.release;
    }
    
    public List<String> get_category(){
        return this.category;
    }
    
    public List<String> get_overview(){
        return this.overview;
    }
    
    public List<String> get_language(){
        return this.language;
    }
    
    public List<String> get_company(){
        return this.company;
    }
    
    public List<String> get_country(){
        return this.country;
    }
    
    public List<Float> get_runtime(){
        return this.runtime;
    }
    
    public List<Boolean> get_adult(){
        return this.adult;
    }
    
    public List<Float> get_popularity(){
        return this.popularity;
    }
    
    public  int get_operation(){
        return this.operation;
    }
    
////--------------------------------------------------------------------------------
    public void set_release(Date date) throws ParseException{
        release.add(date);
    }
    
    
    public void set_category(String str){
        category.add(str);
    }
    
    public void set_overview(String str){
        overview.add(str);
    }
    
    public void set_language(String str){
        language.add(str);
    }
    
    public void set_company(String str){
        company.add(str);
    }
    
    public void set_country(String str){
        country.add(str);
    }
    
    public void set_runtime(float  fl){
        runtime.add(fl);
    }
    
    public void set_adult(boolean bl){
        adult.add(bl);
    }
    
    public void set_popularity(float fl){
        popularity.add(fl);
    }
    
    
////-------------------------------------------------------------------------------
    
    
    
    public void delete_release(Date date) throws ParseException{
        try{
        for(Iterator<Date> it = release.listIterator(); it.hasNext() ;)
        {
            if(it.next() == date)
                it.remove();
        }
//        release.remove(date);
        }catch(Exception e ){System.err.println("release data error");}
    }
    
    
    public void delete_category(String str){
        try{
        for(Iterator<String> it = category.listIterator(); it.hasNext() ;)
        {
            if(it.next().equals(str))
                it.remove();
        }
//        category.remove(str);
        }catch(Exception e ){System.err.println("category error");}
    }
    
    public void delete_overview(String str){
        try{
        for(Iterator<String> it = overview.listIterator(); it.hasNext() ;)
        {
            if(it.next().equals(str))
                it.remove();
        }
//        overview.remove(str);
        }catch(Exception e ){System.err.println("overview error");}
    }
    
    public void delete_language(String str){
        try{
        for(Iterator<String> it = language.listIterator(); it.hasNext() ;)
        {
            if(it.next().equals(str))
                it.remove();
        }
//        language.remove(str);
        }catch(Exception e ){System.err.println("language error");}
    }
    
    public void delete_company(String str){
        try{
        for(Iterator<String> it = company.listIterator(); it.hasNext() ;)
        {
            if(it.next().equals(str))
                it.remove();
        }
//        company.remove(str);
        }catch(Exception e ){System.err.println("company error");}
    }
    
    public void delete_country(String str){
        try{
        for(Iterator<String> it = country.listIterator(); it.hasNext() ;)
        {
            if(it.next().equals(str))
                it.remove();
        }
//        country.remove(str);
        }catch(Exception e ){System.err.println("country error");}
    }
    
    public void delete_runtime(Float  fl){
        try{
        for(Iterator<Float> it = runtime.listIterator(); it.hasNext() ;)
        {
            if(it.next() -fl ==0)
                it.remove();
        }
//        runtime.remove(fl);
        }catch(Exception e ){System.err.println("runtime error");}
    }
    
    public void delete_adult(Boolean bl){
        try{
        for(Iterator<Boolean> it = adult.listIterator(); it.hasNext() ;)
        {
            if((it.next() && bl)==false)
                it.remove();
        }
//        adult.remove(bl);
        }catch(Exception e ){System.err.println("adult error");}
    }
    
    public void delete_popularity(Float fl){
        try{
        for(Iterator<Float> it = popularity.listIterator(); it.hasNext() ;)
        {
            if(it.next() -fl == 0)
                it.remove();
        }
//        popularity.remove(fl);
        }catch(Exception e ){System.err.println("popularity error");}
    }
    
    
////-------------------------------------------------------------------------------
    
    
    public void print_release() throws ParseException{
        System.out.println("****************************************************\n"
                + "This film has the following Release Dates: ");
        int counter=0;
        for(Date date : this.release)
        {
            if(counter>0)
                System.out.println(date);
            counter++;
        }
        System.out.println("****************************************************");
    }
    
    
    public void print_category(){
        System.out.println("****************************************************\n"
                + "This film has the following Categories: ");
        int counter=0;
        for(String str : this.category)
        {
            if(counter>0)
                System.out.println(str);
            counter++;
        }
        System.out.println("****************************************************");
    }
    
    public void print_overview(){
        System.out.println("****************************************************\n"
                + "This film has the following Overviewss: ");
        int counter=0;
        for(String str : this.overview)
        {
            if(counter>0)
                System.out.println(str);
            counter++;
        }
        System.out.println("****************************************************");
    }
    
    public void print_language(){
        System.out.println("****************************************************\n"
                + "This film has the following Languages: ");
        int counter=0;
        for(String str : this.language)
        {
            if(counter>0)
                System.out.println(str);
            counter++;
        }
        System.out.println("****************************************************");
    }
    
    public void print_company(){
        System.out.println("****************************************************\n"
                + "This film has the following production companies: ");
        int counter=0;
        for(String str : this.company)
        {
            if(counter>0)
                System.out.println(str);
            counter++;
        }
        System.out.println("****************************************************");
    }
    
    public void print_country(){
        System.out.println("****************************************************\n"
                + "This film has the following production countries: ");
        int counter=0;
        for(String str : this.country)
        {
            if(counter>0)
                System.out.println(str);
            counter++;
        }
        System.out.println("****************************************************");
    }
    
    public void print_runtime(){
        System.out.println("****************************************************\n"
                + "This film has the following Runtimes: ");
        int counter=0;
        for(float fl : this.runtime)
        {
            if(counter>0)
                System.out.println(fl);
            counter++;
        }
        System.out.println("****************************************************");
    }
    
    public void print_adult(){
        System.out.println("****************************************************\n"
                + "This film has the following Adult constraints: ");
        int counter=0;
        for(boolean bl : this.adult)
        {
            if(counter>0)
                System.out.println(bl);
            counter++;
        }
        System.out.println("****************************************************");
    }
    
    public void print_popularity(){
        System.out.println("****************************************************\n"
                + "This film has the following Popularities: ");
        int counter=0;
        for(float fl : this.popularity)
        {
            if(counter>0)
                System.out.println(fl);
            counter++;
        }
        System.out.println("****************************************************");
    }
    
    
////-------------------------------------------------------------------------------
    
    
    
}
