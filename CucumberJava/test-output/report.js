$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customer.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a new Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.click_on_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view Add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_enter_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_can_view_confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Customer by EmailID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer Email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.enter_customer_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should found Email in the search table",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_should_found_Email_in_the_search_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Customer by Name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer FirstName",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.enter_customer_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer LastName",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.enter_customer_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found Name in the Search table",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_should_found_Name_in_the_Search_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});