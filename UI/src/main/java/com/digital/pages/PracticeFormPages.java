package com.digital.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class PracticeFormPages extends BasePage {
    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(id = "userNumber")
    public WebElement userNumberInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(xpath = "//div[contains(@class, 'custom-radio')]//label[@class='custom-control-label']")
    public List<WebElement> radioGenderButtons;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[@class='custom-control-label']")
    public List<WebElement> hobbiesCheckboxList;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPicture;

    @FindBy(xpath = "//div[@id='state']//div[@aria-hidden='true']")
    public WebElement inputState;

    @FindBy(id = "react-select-3-input")
    public WebElement inputForSetText;

    @FindBy(id = "react-select-4-input")
    public WebElement inputForSetCity;

    @FindBy(xpath = "//div[@id='state']//div[2]")
    public List<WebElement> containerForStateTexts;

    @FindBy(id="subjectsInput")
    public WebElement subjects;

    @FindBy(id= "submit")
    public WebElement submitBtn;

    public PracticeFormPages fillUpTheFirstName(String txt) {
        elementActions.writeText(firstNameInput, txt);
        return this;
    }

    public PracticeFormPages fillUpTheLastName(String txt) {
        elementActions.writeText(lastNameInput, txt);
        return this;
    }

    public PracticeFormPages fillUpTheUserEmail(String txt) {
        elementActions.writeText(userEmailInput, txt);
        return this;
    }

    public PracticeFormPages clickGender() {
        elementActions.clickToRandomElement(radioGenderButtons);
        return this;
    }

    public PracticeFormPages fillUpTheCurrentAddress(String txt) {
        elementActions.writeText(currentAddressInput, txt);
        return this;
    }

    public PracticeFormPages clickHobbies() {
        elementActions.clickToRandomElement(hobbiesCheckboxList);
        return this;
    }

    public PracticeFormPages fillUpTheUserNumber(String txt) {
        elementActions.writeText(userNumberInput, txt);
        return this;
    }


    public PracticeFormPages setUploadPicture(WebElement uploadPicture) {
        elementActions.writeText(uploadPicture, "/Users/zhyldyzzheenbaeva/Desktop/123.png");
        return this;
    }

    public PracticeFormPages selectState() {
        elementActions.clickTheButton(inputState);
        Map<String, String[]> stateAndCityList = new HashMap<>();
        String[] stateOfNcr = new String[]{"Delhi", "Gurgaon", "Noida"};
        String[] UP = new String[]{"Agra", "Lucknow", "Merrut"};
        String[] haryana = new String[]{"Karnal", "Panipat"};
        String[] rajasthan = new String[]{"Jaipur", "Jaiselmer"};
        for (WebElement state : containerForStateTexts) {
            if (state.getText().contains("NCR")) {
                stateAndCityList.put("NCR", stateOfNcr);
            } else if (state.getText().contains("Uttar Pradesh")) {
                stateAndCityList.put("Uttar Pradesh", UP);
            } else if (state.getText().contains("Haryana")) {
                stateAndCityList.put("Haryana", haryana);
            } else if (state.getText().contains("Rajasthan")) {
                stateAndCityList.put("Rajasthan", rajasthan);
            }
        }

        Random random = new Random();
        List<String> keysList = new ArrayList<>(stateAndCityList.keySet());
        String randomKey = keysList.get(random.nextInt(keysList.size()));
        String[] randomCities = stateAndCityList.get(randomKey);
        String randomCity = randomCities[random.nextInt(randomCities.length)];
        elementActions.setTextAndEnterElement(randomKey, inputForSetText);
        elementActions.setTextAndEnterElement(randomCity, inputForSetCity);
        return this;
    }

    public PracticeFormPages selectSubject() {
        elementActions.clickTheButton(subjects);
        List<String> subjectsList = new ArrayList<>();
        subjectsList.add("Accounting");
        subjectsList.add("Arts");
        subjectsList.add("Maths");
        subjectsList.add("Social Studies");
        subjectsList.add("Biology");
        subjectsList.add("Chemistry");
        subjectsList.add("Computer Science");
        subjectsList.add("Commerce");
        subjectsList.add("Hindi");
        subjectsList.add("English");
        subjectsList.add("Physics");
        subjectsList.add("Economics");
        subjectsList.add("History");

        Random random= new Random();

        String randomSubject = subjectsList.get(random.nextInt(subjectsList.size()));
        elementActions.writeText(subjects, randomSubject);
        elementActions.writeText(subjects, ""+ Keys.ENTER);
        return this;
    }
    public PracticeFormPages selectSubmitBtn(){
        elementActions.clickTheButton(submitBtn);
        return this;

    }

}