from django.shortcuts import render
from django.http import HttpResponse

def index(request):
    return render(request, 'calculator/home.html')

def entropy(request):
    return render(request, 'calculator/home.html')
