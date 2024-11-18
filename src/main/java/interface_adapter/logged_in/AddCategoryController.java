package interface_adapter.logged_in;

import use_case.add_category.AddCategoryInputBoundary;
import use_case.add_category.AddCategoryInputData;

/**
 * The controller for the AddCategory Use Case.
 */
public class AddCategoryController {

    private final AddCategoryInputBoundary addCategoryUseCaseInteractor;

    public AddCategoryController(AddCategoryInputBoundary addCategoryUseCaseInteractor) {
        this.addCategoryUseCaseInteractor = addCategoryUseCaseInteractor;
    }

    /**
     * Executes the AddCategory Use Case.
     * @param username the username of the current user
     * @param category the category to add
     */
    public void execute(String username, String category) {
        final AddCategoryInputData addCategoryInputData = new AddCategoryInputData(username, category);
        addCategoryUseCaseInteractor.execute(addCategoryInputData);
    }

}