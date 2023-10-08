package com.sidinei.feature_navigation.routes

sealed class Routes(val route: String) {
    object Home : Routes("home")
    object AgentsList : Routes("agents_list")
    object AgentDetail : Routes("agent_detail/{agentId}")
    object MapsList : Routes("maps_list")
    object MapDetail : Routes("map_detail/{mapId}")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { append("/$it") }
        }
    }
}
