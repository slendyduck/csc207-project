package interface_adapter.logged_in;

import use_case.remove_category.RemoveCategoryInputBoundary;
import use_case.remove_category.RemoveCategoryInputData;

/**
 * The controller for the RemoveCategory Use Case.
 */
public class RemoveCategoryController {
    private final RemoveCategoryInputBoundary removeCategoryUseCaseInteractor;

    public RemoveCategoryController(RemoveCategoryInputBoundary removeCategoryUseCaseInteractor) {
        this.removeCategoryUseCaseInteractor = removeCategoryUseCaseInteractor;
    }

    /**
     * Executes the RemoveCategory Use Case.
     * @param username the username of the current user
     * @param category the category to remove
     */
    public void execute(String username, String category) {
        final RemoveCategoryInputData removeCategoryInputData = new RemoveCategoryInputData(username, category);
        removeCategoryUseCaseInteractor.execute(removeCategoryInputData);
    }

}
