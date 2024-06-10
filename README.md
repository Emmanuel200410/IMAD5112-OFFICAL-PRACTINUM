# IMAD5112-OFFICAL-PRACTINUM
psedocode

start // SplashActivity Initialize Splash Screen Layout On Start Button Click: Navigate to MainActivity On Exit Button Click: Exit the application

// MainActivity Initialize Main Screen Layout Initialize morningTemps and afternoonTemps arrays to store temperatures for 7 days Initialize currentIndex to 0

On Save Button Click: Retrieve morningTemp from morningTempInput Retrieve afternoonTemp from afternoonTempInput If morningTemp and afternoonTemp are valid numbers: If currentIndex < 7: Store morningTemp in morningTemps[currentIndex] Store afternoonTemp in afternoonTemps[currentIndex] Increment currentIndex Clear morningTempInput and afternoonTempInput Show confirmation message Else: Show all data saved message Else: Show error message

On Clear Button Click: Clear morningTempInput and afternoonTempInput Reset morningTemps and afternoonTemps arrays to 0 Reset currentIndex to 0 Show confirmation message

On View Details Button Click: Navigate to DetailedViewActivity Pass morningTemps, afternoonTemps, and days arrays to DetailedViewActivity

On View Weekly Average Button Click: Navigate to AverageViewActivity Pass morningTemps and afternoonTemps arrays to AverageViewActivity

// DetailedViewActivity Initialize Detailed View Layout Retrieve morningTemps, afternoonTemps, and days arrays from Intent Calculate averageTemp for the current day Display current day name and averageTemp On Back Button Click: Navigate back to MainActivity

// AverageViewActivity Initialize Average View Layout Retrieve morningTemps and afternoonTemps arrays from Intent Calculate weekly average temperature Display weekly average temperature On Back to Main Button Click: Navigate back to MainActivity end

description of application

PowerPoint Presentation Content:

Introduction

Title: Weather Conditions App
Subtitle: Overview of App Screens and Functionality
Splash Screen

Description: The splash screen introduces the app with basic information.
Function: Users can start the app or exit.
Screenshot: Include an image of the splash screen.
Main Screen
Description: The main screen is where users input the morning and afternoon temperatures.
Function: Users can save, clear, or view detailed temperature data.
Screenshot: Include an image of the main screen.
Details: Explain the process of saving temperature data and clearing inputs.
Detailed View Screen
Description: The detailed view screen displays the average temperatures for the week.
Function: Shows weekly average morning and afternoon temperatures, along with overall average.
Screenshot: Include an image of the detailed view screen.
Details: Explain how the averages are calculated and displayed.
Data Handling

Description: Overview of how data is handled across screens.
Process:
Data Entry: Users enter temperatures in the main screen.
Data Storage: Temperatures are stored in arrays.
Data Display: Detailed view calculates and displays averages.
Diagram: Simple flow diagram showing the data flow from input to display.
Conclusion

Recap: Summary of what each screen does.
Future Enhancements: Potential improvements like data validation, more detailed analytics.
Thank You: Thank the audience for their attention.
