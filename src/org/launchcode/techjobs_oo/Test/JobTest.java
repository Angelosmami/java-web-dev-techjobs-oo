package org.launchcode.techjobs_oo.Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Assert.*;

import static org.junit.Assert.*;


public class JobTest {

    Job job1;
    Job job2;
    Job job3;
    Job job4;

    @Before
    public void setUp() {
         job1 = new Job();
         job2 = new Job();
         job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }


    @Test
    public void testSettingJobId(){
    assertEquals((job1.getId()+1), job2.getId());
    }

    @Test
    public void TestJobConstructorSetsAllFields(){
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());}

    @Test
    public void TestForEquality(){
        assertFalse( job1.equals (job2));

    }

    @Test
    public void TestForBlanks(){
        Assert.assertEquals(true, job3.toString().startsWith("\n"));
    }

    @Test
    public void TestToString(){
        assertEquals( "\nID: " + job3.getId() +
                "\nName: " + job3.getName() +
                "\nEmployer: " + job3.getEmployer() +
                "\nLocation: " + job3.getLocation() +
                "\nPosition Type: " + job3.getPositionType() +
                "\nCore Competency: "+ job3.getCoreCompetency(),
                job3.toString());

    }
}
