import dialogs.EntranceInAccountDialog;
import elements.PageElements;

public class WebBot {

    public MasterPage onMasterPage() {
        return new MasterPage();
    }

    public EntranceInAccountDialog entranceInAccountDialog() {
        return new EntranceInAccountDialog(PageElements.ENTRANCE_IN_ACCOUNT_DIALOG);
    }
}
