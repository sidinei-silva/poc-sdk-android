package com.sidinei.feature_navigation.utils

import androidx.navigation.NavController
import com.sidinei.feature_navigation.routes.Routes

fun NavController.navigateToAgentDetail(agentId: String) {
    navigate(Routes.AgentDetail.route.replace("{agentId}", agentId))
}

fun NavController.navigateToMapDetail(mapId: String) {
    navigate(Routes.MapDetail.route.replace("{mapId}", mapId))
}
