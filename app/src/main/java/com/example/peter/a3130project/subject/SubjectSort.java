package com.example.peter.a3130project.subject;

import com.example.peter.a3130project.course.Course;
import java.util.ArrayList;
import java.util.HashMap;

/** 
 * July 23, 2018
 *
 * @author Peter Lee
 * @author Joanna Bistekos
 *
 * Class for handling sorting of classes by subject
 **/
public class SubjectSort {
    private ArrayList<String> categories;
    public SubjectSort(ArrayList<String> categories) {
        this.categories = categories;
    }

    /** doSort
     * @param courses
     * @return Hashset for each course identifier
     **/
    public HashMap<String,ArrayList<Course>> doSort(ArrayList<Course> courses) {
        HashMap<String,ArrayList<Course>> ret = new HashMap<String,ArrayList<Course>>();
        /* Initialize hashset */
        for (String s : categories) {
            ret.put(s, new ArrayList<Course>());
        }

        /* Go through and sort each course into subjects */
        for (Course c : courses) {
            for (String s : categories) {
                if (c.getcode().startsWith(s)) {
                    ret.get(s).add(c);
                    break;
                }
            }
        }

        return ret;
    }

        
    public ArrayList<String> getcategories(){
        return this.categories;
    }
    public void setcategories(ArrayList<String> val){
         this.categories = val;
    }}