package lk.HostelManagementSystem.Controller;

import javafx.event.ActionEvent;

import java.io.IOException;

public class DashboardFormController {
    public void btnStudentOnAction(ActionEvent actionEvent)throws IOException {
        Navigation.navigation(Routes.MANAGE_STUDENTS,home)
    }

    public void btnRoomOnAction(ActionEvent actionEvent) {
    }

    public void btnReservationOnAction(ActionEvent actionEvent) {
    }

    public void btnReservationDetailOnAction(ActionEvent actionEvent) {
    }

    public void btnPayementOnAction(ActionEvent actionEvent) {
    }

    public void bntLogOutOnAction(ActionEvent actionEvent) {
    }
}
