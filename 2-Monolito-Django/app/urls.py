from django.urls import path
from . import views

urlpatterns = [
    path('', views.indexView, name='index'),
    path('build/', views.buildView, name='build'),
    path('cart/', views.cartView, name='cart'),
]
