import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AllComponent } from './news/all/all.component';
import { ArtsComponent } from './news/arts/arts.component';
import { BooksComponent } from './news/books/books.component';
import { BusinessComponent } from './news/business/business.component';
import { EntertainmentComponent } from './news/entertainment/entertainment.component';
import { FoodComponent } from './news/food/food.component';
import { HealthComponent } from './news/health/health.component';
import { PoliticalComponent } from './news/political/political.component';
import { ScienceComponent } from './news/science/science.component';
import { SportsComponent } from './news/sports/sports.component';
import { TechnologyComponent } from './news/technology/technology.component';
import { UsComponent } from './news/us/us.component';
import { WorldComponent } from './news/world/world.component';


const routes: Routes = [
  { path: '', redirectTo: '/news/all', pathMatch: 'full' },
  { path: 'news/all', component: AllComponent},  
  { path: 'news/arts', component: ArtsComponent},  
  { path: 'news/books', component: BooksComponent},  
  { path: 'news/business', component: BusinessComponent },
  { path: 'news/food', component: FoodComponent },
  { path: 'news/entertainment', component: EntertainmentComponent },
  { path: 'news/health', component: HealthComponent },
  { path: 'news/political', component: PoliticalComponent },
  { path: 'news/science', component: ScienceComponent },
  { path: 'news/sports', component: SportsComponent },
  { path: 'news/technology', component: TechnologyComponent },
  { path: 'news/us', component: UsComponent },
  { path: 'news/world', component: WorldComponent },
  { path: 'basic-ui', loadChildren: () => import('./basic-ui/basic-ui.module').then(m => m.BasicUiModule) },
  { path: 'charts', loadChildren: () => import('./charts/charts.module').then(m => m.ChartsDemoModule) },
  { path: 'forms', loadChildren: () => import('./forms/form.module').then(m => m.FormModule) },
  { path: 'tables', loadChildren: () => import('./tables/tables.module').then(m => m.TablesModule) },
  { path: 'icons', loadChildren: () => import('./icons/icons.module').then(m => m.IconsModule) },
  { path: 'general-pages', loadChildren: () => import('./general-pages/general-pages.module').then(m => m.GeneralPagesModule) },
  { path: 'apps', loadChildren: () => import('./apps/apps.module').then(m => m.AppsModule) },
  { path: 'user-pages', loadChildren: () => import('./user-pages/user-pages.module').then(m => m.UserPagesModule) },
  { path: 'error-pages', loadChildren: () => import('./error-pages/error-pages.module').then(m => m.ErrorPagesModule) },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
