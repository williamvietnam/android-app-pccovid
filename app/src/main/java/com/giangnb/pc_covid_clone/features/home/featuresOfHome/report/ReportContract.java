package com.giangnb.pc_covid_clone.features.home.featuresOfHome.report;

import com.giangnb.pc_covid_clone.data.model.Report;

import java.util.ArrayList;

public interface ReportContract {
    interface ViewReport{

    }

    interface ViewReportDetail{

    }

    interface ViewModel{
      ArrayList<Report> mockDataUiForAdapter();
    }

}
