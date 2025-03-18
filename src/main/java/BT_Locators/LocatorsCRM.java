package BT_Locators;



public class LocatorsCRM {


    //Xpath tương đối cách 1 đến 5
    //Login page
    public static String headerLogin = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";
    public static String alertErrorMessage = "//div[@id='alerts']/div"; //Wrong ID or password
    public static String alertDangerMes1 = "//div[(contains(@class,'alert-danger')) and (normalize-space()='The Password field is required.')]"; // Password is empty
    public static String alertDangerMes2 = "//div[starts-with(@class,'alert alert-danger') and (normalize-space()='The Email Address field is required.')]"; // Email address is empty

    //Customer page
    public static String menuCustomer = "//li[(@class='menu-item-customers') and (normalize-space()='Customers')]";
    public static String searchBoxHeaderC = "//input[(@id='search_input')]";
    public static String buttonSearchC = "//i[(@class='fa fa-search')]";
    public static String headerCustomerPage = "//div[@id='customers_bulk_action']/ancestor::div//span[normalize-space()='Customers Summary']";
    public static String totalCustomers = "(//div[contains(@class,'tw-grid')]//span[contains(@class,'tw-font-semibold')])[1]";
    public static String activeCustomers = "(//div[contains(@class,'tw-grid')]//span[contains(@class,'tw-font-semibold')])[2]";
    public static String inactiveCustomers = "(//div[contains(@class,'tw-grid')]//span[contains(@class,'tw-font-semibold')])[3]";
    public static String activeContacts = "(//div[contains(@class,'tw-grid')]//span[contains(@class,'tw-font-semibold')])[4]";
    public static String inactiveContacts = "(//div[contains(@class,'tw-grid')]//span[contains(@class,'tw-font-semibold')])[5]";
    public static String contactLoggedInToday = "(//div[contains(@class,'tw-grid')]//span[contains(@class,'tw-font-semibold')])[6]";
    public static String buttonAddNewCustomer = "//a[(@href='https://crm.anhtester.com/admin/clients/client') and (normalize-space()='New Customer')]";
    public static String buttonImportCustomers = "//a[(@href='https://crm.anhtester.com/admin/clients/import') and (normalize-space()='Import Customers')]";
    public static String buttonContacts = "//a[(@href='https://crm.anhtester.com/admin/clients/all_contacts') and (normalize-space()='Contacts')]";
    public static String iconFiltersC = "//i[@class='fa fa-filter']";
    public static String searchBoxCustomer = "//input[(@type='search') and (@aria-controls='clients')]";
    public static String recordPerPaginationC = "//select[@name='clients_length']";
    public static String exportCustomer = "//button[(@type='button') and (normalize-space()='Export')]";
    public static String buttonBurnActions = "//button[(@type='button') and (normalize-space()='Bulk Actions')]";
    public static String refreshCustomer = "//i[@class='fa fa-refresh']";

    //New Customer pages
    public static String buttonQuickCreate = "//li[contains(@class,'icon tw-relative')]";

    //Customer Details tab
    public static String tabcustomerDetails = "//a[(@href='#contact_info') and (normalize-space()='Customer Details')]";
    public static String textboxCompany = "//input[(@type='text') and (@id='company')]";
    public static String textboxVATNumber = "//input[(@type='text') and (@id='vat')]";
    public static String textboxPhone = "//input[(@type='text') and (@id='phonenumber')]";
    public static String website = "//input[(@type='text') and (@id='website')]";
    public static String dropdownlistGroups = "//button[@data-id='groups_in[]']";
    public static String buttonCreateNewGroup = "//a[@class='btn btn-default']";
    public static String dropdownlistCurrency = "//button[@data-id='default_currency']";
    public static String dropdownlistDefaultLang = "//button[@data-id='default_language']";
    public static String textboxAddress = "//textarea[@id='address']";
    public static String textboxCity = "//input[(@type='text') and (@id='city')]";
    public static String textboxState = "//input[(@type='text') and (@id='state')]";
    public static String textboxZipCode = "//input[(@type='text') and (@id='zip')]";
    public static String dropdownlistCountry = "//button[@data-id='country']";
    public static String buttonSaveandCreateContactC = "//button[normalize-space()='Save and create contact']";
    public static String buttonSaveC = "(//button[normalize-space()='Save'])[2]";
    public static String errorMessageCustomer = "//p[(@id='company-error') and (normalize-space()='This field is required.')]"; //Bỏ trống trường Company

    //Billing & Shipping tab
    public static String tabbillingAndShipping = "//a[(@href='#billing_and_shipping') and (normalize-space()='Billing & Shipping')]";
    //Billing Address
    public static String textboxBillingStreet = "//textarea[@id='billing_street']";
    public static String textboxBillingCity = "//input[@id='billing_city']";
    public static String textboxBillingState = "//input[@id='billing_state']";
    public static String textboxBillingZipCode = "//input[@id='billing_zip']";
    public static String dropdownlistBillingCountry = "//button[@data-id='billing_country']";
    // Shipping Address
    public static String textboxShippingStreet = "//textarea[@id='shipping_street']";
    public static String textboxShippingCity = "//input[@id='shipping_city']";
    public static String textboxShippingState = "//input[@id='shipping_state']";
    public static String textboxShippingZipCode = "//input[@id='shipping_zip']";
    public static String dropdownlistShippingCountry = "//button[@data-id='shipping_country']";
    public static String buttonSaveandCreateContactB = "//button[normalize-space()='Save and create contact']";
    public static String buttonSaveB = "(//button[normalize-space()='Save'])[2]";

    //Xpath tương đối cách 6 đến 10

    //Projects page
    public static String menuProject = "//aside[@id='menu']/descendant::span[normalize-space()='Projects']";
    public static String headerProjectPage = "//div[@class='col-md-12']/descendant::span[normalize-space()='Projects Summary']";
    public static String searchBoxHeaderP = "//div[@id='top_search']/child::input";
    public static String buttonSearchP = "//div[@id='top_search']/child::div[@id='top_search_button']/descendant::i";
    public static String buttonNewProject = "(//div[@class='_buttons tw-mb-2 sm:tw-mb-4']/descendant::i)[1]";
    public static String buttonGantt = "(//div[@class='_buttons tw-mb-2 sm:tw-mb-4']/descendant::i)[2]";
    public static String iconFiltersP = "(//div[@class='_buttons tw-mb-2 sm:tw-mb-4']/descendant::i)[3]";
    public static String totalNotStartedProject = "//div[@class='_filters _hidden_inputs']/descendant::span[normalize-space()='Not Started']/preceding-sibling::span";
    public static String totalInprogressProject = "//div[@class='_filters _hidden_inputs']/descendant::span[normalize-space()='In Progress']/preceding-sibling::span";
    public static String totalOnHoldProject = "//div[@class='_filters _hidden_inputs']/descendant::span[normalize-space()='On Hold']/preceding-sibling::span";
    public static String totalCancelledProject = "//div[@class='_filters _hidden_inputs']/descendant::span[normalize-space()='Cancelled']/preceding-sibling::span";
    public static String totalFinishedProject = "//div[@class='_filters _hidden_inputs']/descendant::span[normalize-space()='Finished']/preceding-sibling::span";
    public static String searchBoxProject = "//div[@class='input-group']/child::input";
    public static String recordPerPaginationP = "//div[@id='projects_length']/descendant::select";
    public static String exportProject = "//div[@class='dt-buttons btn-group']/child::button[@type='button']/preceding-sibling::button";
    public static String refreshProject = "//div[@class='dt-buttons btn-group']/child::button[@type='button']/following-sibling::button";

    // New Project
    public static String headeraddNewProject = "//div[@class='col-md-8 col-md-offset-2']/child::h4";
    //Project tab
    public static String projectTab = "(//ul[@class='nav nav-tabs nav-tabs-horizontal']/li[@role='presentation']/child::a)[1]";
    public static String textboxProjectName = "//div[@class='form-group']//label[contains(normalize-space(),'Project Name')]/following-sibling::input";
    public static String dropdownlistCustomer = "//label[@for='clientid']/following-sibling::div/button[@aria-owns='bs-select-6']";
    public static String checkboxCalculate = "//div[@class='checkbox checkbox-success']/child::input";
    public static String progressBar = "//div[@class='tab-content tw-mt-3']/descendant::div/span[@class='ui-slider-handle ui-corner-all ui-state-default']";
    public static String dropdownlistbillingType = "//label[@for='billing_type']/following-sibling::div/button[@data-id='billing_type']";
    public static String dropdownlistStatus = "//div/label[@for='status']/following-sibling::div/button[@data-id='status']";
    public static String textboxTotalRate = "//div[@id='project_cost']/descendant::input[@id='project_cost']";
    public static String textboxEstimatedHours = "//label[@for='estimated_hours']/following-sibling::input";
    public static String dropdownlistMember = "//div/label[normalize-space()='Members']/following-sibling::div/button[@data-id='project_members[]']";
    public static String startdateTextbox = "//label[@for='start_date']/following-sibling::div/input[@id='start_date']";
    public static String startdateDatepicker = "//label[@for='start_date']/following-sibling::div/div[@class='input-group-addon']";
    public static String deadlineTextbox = "//div/label[@for='deadline']/following::div/input[@id='deadline']";
    public static String deadlineDatepicker = "//div/label[@for='deadline']/following::div/div[@class='input-group-addon']";
    public static String tagstextbox = "//label[@for='tags']/following-sibling::ul//input[@class='ui-widget-content ui-autocomplete-input']";
    public static String descriptionFile = "//div[@class='tox-editor-header']//descendant::button/span[normalize-space()='File']";
    public static String descriptionEdit = "//div[@class='tox-editor-header']//descendant::button/span[normalize-space()='Edit']";
    public static String descriptionView = "//div[@class='tox-editor-header']//descendant::button/span[normalize-space()='View']";
    public static String descriptionInsert = "//div[@class='tox-editor-header']//descendant::button/span[normalize-space()='Insert']";
    public static String descriptionFormat = "//div[@class='tox-editor-header']//descendant::button/span[normalize-space()='Format']";
    public static String descriptionTools = "//div[@class='tox-editor-header']//descendant::button/span[normalize-space()='Tools']";
    public static String descriptionTable = "//div[@class='tox-editor-header']//descendant::button/span[normalize-space()='Table']";
    public static String descriptionFont = "(//div[@class='tox-editor-header']//descendant::button/span[@class='tox-tbtn__select-label'])[1]";
    public static String descriptionFontSize = "(//div[@class='tox-editor-header']//descendant::button/span[@class='tox-tbtn__select-label'])[2]";
    public static String descriptionTextColor = "(//div[@role='group']/descendant::span[@class='tox-tbtn tox-split-button__chevron'])[1]";
    public static String descriptionBackgroundColor = "(//div[@role='group']/descendant::span[@class='tox-tbtn tox-split-button__chevron'])[2]";
    public static String descriptionBold = "(//div[@role='group']/descendant::span[@class='tox-icon tox-tbtn__icon-wrap'])[3]";
    public static String descriptionItalic = "(//div[@role='group']/descendant::span[@class='tox-icon tox-tbtn__icon-wrap'])[4]";
    public static String descriptionAlignLeft = "(//div[@role='group']/descendant::span[@class='tox-icon tox-tbtn__icon-wrap'])[5]";
    public static String descriptionCenter = "(//div[@role='group']/descendant::span[@class='tox-icon tox-tbtn__icon-wrap'])[6]";
    public static String descriptionAlignRight = "(//div[@role='group']/descendant::span[@class='tox-icon tox-tbtn__icon-wrap'])[7]";
    public static String descriptionJustify = "(//div[@role='group']/descendant::span[@class='tox-icon tox-tbtn__icon-wrap'])[8]";
    public static String descriptionMoreOptions = "(//div[@role='group']/descendant::span[@class='tox-icon tox-tbtn__icon-wrap'])[9]";
    public static String labelDescription = "//div[@id='tab_project']/child::p[normalize-space()='Description']";
    public static String checkboxsendCreatedEmail = "//input[@id='send_created_email']";
    public static String labelSendCreatedEmail = "//label[normalize-space()='Send project created email']";
    public static String buttonSaveP = "//div[@class='panel-footer text-right']/child::button[@type='submit']";

    //Project Settings tab
    public static String projectSettingsTab = "(//ul[@class='nav nav-tabs nav-tabs-horizontal']/li[@role='presentation']/child::a)[2]";
    public static String dropdownsendContactsNotifications = "//label[@for='contact_notification']/following-sibling::div/button[@data-id='contact_notification']";
    public static String dropdownvisibleTabs = "//label[@for='available_features']/following-sibling::div/button[@data-id='available_features']";
    public static String allowCustomerToViewTasks = "//div[@class='checkbox']/child::input[@id='view_tasks']";
    public static String allowCustomerToCreateTasks = "//div[@class='checkbox']/child::input[@id='create_tasks']";
    public static String allowCustomerToEditTasks = "//div[@class='checkbox']/child::input[@id='edit_tasks']";
    public static String allowCustomerToCommentOnTasks = "//div[@class='checkbox']/child::input[@id='comment_on_tasks']";
    public static String allowCustomerToViewComments = "//div[@class='checkbox']/child::input[@id='view_task_comments']";
    public static String allowCustomerToViewTasksAttachments = "//div[@class='checkbox']/child::input[@id='view_task_attachments']";
    public static String allowCustomerToViewTasksChecklist = "//div[@class='checkbox']/child::input[@id='view_task_checklist_items']";
    public static String allowCustomerToUploadAttachments = "//div[@class='checkbox']/child::input[@id='upload_on_tasks']";
    public static String allowCustomerToViewTotalloggedTime = "//div[@class='checkbox']/child::input[@id='view_task_total_logged_time']";
    public static String allowCustomerToViewFinanceOverview = "//div[@class='checkbox']/child::input[@id='view_finance_overview']";
    public static String allowCustomerToUploadFiles = "//div[@class='checkbox']/child::input[@id='upload_files']";
    public static String allowCustomerToOpenDiscussion = "//div[@class='checkbox']/child::input[@id='open_discussions']";
    public static String allowCustomerToViewMilestones = "//div[@class='checkbox']/child::input[@id='view_milestones']";
    public static String allowCustomerToViewGantt = "//div[@class='checkbox']/child::input[@id='view_gantt']";
    public static String allowCustomerToViewTimeSheets = "//div[@class='checkbox']/child::input[@id='view_timesheets']";
    public static String allowCustomerToViewActivityLogs = "//div[@class='checkbox']/child::input[@id='view_activity_log']";
    public static String allowCustomerToViewTeamMembers = "//div[@class='checkbox']/child::input[@id='view_team_members']";
    public static String hideProjectTasksOnMainTasksTable = "//div[@class='checkbox']/child::input[@id='hide_tasks_on_main_tasks_table']";
    public static String buttonSavePS = "//div[@class='panel-footer text-right']/child::button[@type='submit']";
}
