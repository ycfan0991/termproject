package interface_adapter.deleteMedicine;

import interface_adapter.ViewModel;
import interface_adapter.enterMedicine.EnterState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class DeleteViewModel extends ViewModel {
    public static final String BACK_BUTTON_LABEL = "Back";
    public static final String HEADER_LABEL = "Enter your medication below to delete!";
    public static final String MEDICINE_NAME_LABEL = "Name of Medication:";
    private static DeleteState deleteState = new DeleteState();
    public DeleteViewModel() {super("delete");}
    public void setState(DeleteState state) {
        deleteState = state;
    }
    public DeleteState getState() {
        return deleteState;
    }
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    @Override
    public void firePropertyChanged() {support.firePropertyChange("state", null, deleteState);
    }

    @Override
    public void firePropertyChanged(String[] item) {}

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {support.addPropertyChangeListener(listener);}
}