import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sidinei.feature_navigation.presentation.screens.HomeScreen
import com.sidinei.feature_navigation.routes.Routes

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Home.route) {
        composable(Routes.Home.route) {
            HomeScreen()
        }
        composable(Routes.AgentsList.route) {
        }
        composable(Routes.MapsList.route) {
        }
        composable(Routes.AgentDetail.withArgs("{agentId}")) { backStackEntry ->
            val agentId = backStackEntry.arguments?.getString("agentId")
        }
    }
}
