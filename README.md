Software development requirement & planning document for Wedding APP
•statement of purpose

1.What the application will do
It is a wedding planner command-line application, which will help the user to choose the best option for their wedding ceremony.

2.What business problem it addresses
Traditional wedding planning is manual.  It requires the user to actually go or call the venues to get information. This app will help couples to plan their special night in a more integrated way and it will reduce their amount of pressure. They can also estimate the price they are going to expect and play around with the packages to find their best option based on their budget.

3.The target audience
As the app name suggests, this application will target any couple who wants to plan their wedding. Regardless of their age, and sex.

•list of features that will be included in the APP

The Wedding App has several Models and classes which are as following:

1.Class Main
This is the main entry point of the project, which will run the methods required for the app to do its job.

2.Class Play
This class contains all the methods and their actual code. The methods in the class main are static and can be accessed directly from the class play.

3.Class Wedding Packages
This class is a model class for wedding packages. Which stores the package id, hour (the length of the function), List of the Add-ons, Drink package (which are classes themselves), Style of the wedding, and the price of each package. 

4.Class Drink Packages
Drink packages class is another model class to store each drink package; this class includes the drink package’s id, price, name, and detail. Users can only choose one drink package.

5.Class Add On
The class add-on also is a model class, which is used to store the add-on id, name, price, and detail. Each user can add one or a few add-ons to their package. 

6.Total Price Calculation
Finally based on the user selection of add-ons, drink packages, wedding packages, and the number of guests they plan to have; the app will calculate the total estimated price.

