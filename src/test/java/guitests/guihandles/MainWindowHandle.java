package guitests.guihandles;

import javafx.stage.Stage;

/**
 * Provides a handle for {@code MainWindow}.
 */
public class MainWindowHandle extends StageHandle {

    private final OrderItemListPanelHandle orderItemListPanel;
    private final ResultDisplayHandle resultDisplay;
    private final CommandBoxHandle commandBox;
    private final StatusBarFooterHandle statusBarFooter;
    private final MainMenuHandle mainMenu;
    private final BrowserPanelHandle browserPanel;
    private final BillBrowserPanelHandle billBrowserPanel;

    public MainWindowHandle(Stage stage) {
        super(stage);

        orderItemListPanel =
                new OrderItemListPanelHandle(getChildNode(OrderItemListPanelHandle.ORDER_ITEM_LIST_VIEW_ID));
        resultDisplay = new ResultDisplayHandle(getChildNode(ResultDisplayHandle.RESULT_DISPLAY_ID));
        commandBox = new CommandBoxHandle(getChildNode(CommandBoxHandle.COMMAND_INPUT_FIELD_ID));
        statusBarFooter = new StatusBarFooterHandle(getChildNode(StatusBarFooterHandle.STATUS_BAR_PLACEHOLDER));
        mainMenu = new MainMenuHandle(getChildNode(MainMenuHandle.MENU_BAR_ID));
        browserPanel = new BrowserPanelHandle(getChildNode(BrowserPanelHandle.BROWSER_ID));
        billBrowserPanel = new BillBrowserPanelHandle(getChildNode(BillBrowserPanelHandle.BILL_BROWSER_ID));
    }

    public OrderItemListPanelHandle getOrderItemListPanel() {
        return orderItemListPanel;
    }

    public ResultDisplayHandle getResultDisplay() {
        return resultDisplay;
    }

    public CommandBoxHandle getCommandBox() {
        return commandBox;
    }

    public StatusBarFooterHandle getStatusBarFooter() {
        return statusBarFooter;
    }

    public MainMenuHandle getMainMenu() {
        return mainMenu;
    }

    public BrowserPanelHandle getBrowserPanel() {
        return browserPanel;
    }

    public BillBrowserPanelHandle getBillBrowserPanel() {
        return billBrowserPanel;
    }
}
