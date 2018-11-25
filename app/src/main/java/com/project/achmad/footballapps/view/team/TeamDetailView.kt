package com.project.achmad.footballapps.view.team

interface TeamDetailView{
    fun showLoading()
    fun hideLoading()
    fun showTeamDetail(data: List<Team>)
}