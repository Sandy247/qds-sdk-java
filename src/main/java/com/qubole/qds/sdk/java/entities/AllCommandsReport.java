package com.qubole.qds.sdk.java.entities;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AllCommandsReport
{
    private String sort_column;
    private String start_date;
    private String end_date;
    private List<Query> queries;

    public AllCommandsReport()
    {
    }

    public AllCommandsReport(String sort_column, String start_date, String end_date, List<Query> queries)
    {
        this.sort_column = sort_column;
        this.start_date = start_date;
        this.end_date = end_date;
        this.queries = queries;
    }

    public String getSort_column()
    {
        return sort_column;
    }

    public void setSort_column(String sort_column)
    {
        this.sort_column = sort_column;
    }

    public String getStart_date()
    {
        return start_date;
    }

    public void setStart_date(String start_date)
    {
        this.start_date = start_date;
    }

    public String getEnd_date()
    {
        return end_date;
    }

    public void setEnd_date(String end_date)
    {
        this.end_date = end_date;
    }

    public List<Query> getQueries()
    {
        return queries;
    }

    public void setQueries(List<Query> queries)
    {
        this.queries = queries;
    }
}
