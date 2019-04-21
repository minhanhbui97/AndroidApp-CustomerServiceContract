# AndroidApp-CustomerServiceContract
My Android app - Customer Service Contract!

The app consists of 2 pages (2 Activity: MainActivity & CustomerInfoActivity), and 1 class (Customer).

- Customer class includes the Id, First Name, Last Name, Age, and Type.

**(MainActivity) The first screen shows the list of customers. When the user touches (taps) a customer:**

- If the age of the selected customer is less than 18, the customer cannot sign a service contract.  Then, the app shows a “toast” displaying the message: “You cannot sign a service contract!”
- Otherwise, the app display the second screen. 

**(CustomerInfoActivity) The second screen shows the selected customer’s full name. It also provides an input field and a Calculation button**

- The monthly fees are $11.05 and $20.25 for the residential and commercial customers, respectively.
- Total contract cost = the number of months × monthly fee.

**Here are list of 5 customers that will need to be displayed in the 1st page (MainActivity)**

| ID  | FirstName | LastName | Age | Type |
|-----|-----------|----------|-----|------|
| 101 | John      | Wilson   | 17  | R    |
| 102 | Peter     | Smith    | 19  | C    |
| 103 | Sam       | Will     | 30  | C    |
| 104 | Anna      | Anderson | 15  | R    |
| 105 | Jacob     | Billy    | 23  | R    |

```
    int[] intIDs = {101, 102, 103, 104, 105};
    String[] strFirstNames = {"John", "Peter", "Sam", "Anna", "Jacob"};
    String[] strLastNames = {"Wilson", "Smith", "Will", "Anderson", "Billy"};
    int[] intAges = {17, 19, 30, 15, 23};
    String[] strType = {"R", "C", "C", "R", "R"};
    
    
