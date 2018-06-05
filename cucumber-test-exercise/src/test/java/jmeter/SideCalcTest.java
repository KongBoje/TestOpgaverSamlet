package jmeter;

import com.SideCalc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class SideCalcTest {

    SideCalc calc;
    String equilateral;
    String isoscele;
    String scalene;
    String notValid;
    private int a;
    private int b;
    private int c;
    private String actualAnswer;
    SideCalc sideCalc = new SideCalc();

    @org.junit.Before
    public void before() {
        calc = new SideCalc();
        equilateral = "This is an equilateral triangle";
        isoscele = "This is an isoscele triangle";
        scalene = "This is a scalene triangle";
        notValid = "This is not a triangle";
    }

    @org.junit.Test
    public void calcSides() throws Exception {
        assertEquals(equilateral, calc.calcSides(2,2,2));
        assertEquals(isoscele, calc.calcSides(2,3,2));
        assertEquals(scalene, calc.calcSides(5,3,6));
        assertEquals(notValid, calc.calcSides(1,2,3));
    }


    // equilateral
    @Given("^we wanna make a triangle$")
    public void we_wanna_make_a_triangle() {
        this.a = 2;
        this.b = 2;
        this.c = 2;
    }

    @When("^we give all sides the same length$")
    public void we_give_all_sides_the_same_length() {
        this.actualAnswer = sideCalc.calcSides(a,b,c);
    }

    @Then("^I should be told that \"([^\"]*)\"$")
    public void i_should_be_told_what_triangle_i_got(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    //isoscele
    @Given("^we wanna make a isoscele triangle$")
    public void we_wanna_make_a_isoscele_triangle() {
        this.a = 3;
        this.b = 3;
        this.c = 2;
    }

    @When("^two sides have the same length$")
    public void two_sides_same_length() {
        this.actualAnswer = sideCalc.calcSides(a,b,c);
    }

    @And("^two sides are longer that the third$")
    public void two_sides_are_longer_than_the_third(){
        sideCalc.isValid(a,b,c);
    }

    @Then("^we should be told \"([^\"]*)\"$")
    public void we_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    //scalene
    @Given("^we wanna make a scalene triangle$")
    public void we_wanna_make_a_triangle2() {
        this.a = 3;
        this.b = 4;
        this.c = 2;
    }

    @When("^no sides have the same length$")
    public void we_give_all_sides_the_same_length2() {
        this.actualAnswer = sideCalc.calcSides(a,b,c);
    }


    @Then("^I should be toldd \"([^\"]*)\"$")
    public void i_should_be_told_what_triangle_i_got2(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }


/*
    Couldn't find a solution on how to work with the csv file, only how to create tables by putting them in manually

    //Valid triangle
    @Given("^we have the sides <a>, <b> and <c>$")
    public void we_wanna_make_a_triangle_with_sides() {
        this.a = 3;
        this.b = 4;
        this.c = 2;
    }

    @When("^we check to see if we have valid triangle$")
    public void check_sides(DataTable args) {
        List<List<String>> data = args.raw();
        for (List<String> string : data) {
                this.actualAnswer = calcSides(Integer.getInteger(string.get(0)), Integer.getInteger(string.get(1)), Integer.getInteger(string.get(2)));

        }

    }

    @Then("^I should be told that my triangle is \"([^\"]*)\"$")
    public void i_should_be_told_that_my_triangle_is(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
*/
}
