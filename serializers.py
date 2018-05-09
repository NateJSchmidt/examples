from rest_framework import serializers
from .models import Recall

class RecallSerializer(serializers.ModelSerializer):
    class Meta:
        model = Recall
        fields = ('recall_number', 'recall_date', 'description', 'url', 'title', 'consumer_contact',
                  'last_publish_date', 'products', 'injunctions',
    images = models.ManyToManyField(Images)
    injuries = models.ManyToManyField(Injuries)
    manufacturers = models.ManyToManyField(Manufacturers)
    retailers = models.ManyToManyField(Retailers)
    importers = models.ManyToManyField(Importers)
    distributors = models.ManyToManyField(Distributors)
    sold_at_label = models.TextField(null=True)
    manufacturer_countries = models.ManyToManyField(ManufacturerCountry)
    product_upcs = models.ManyToManyField(ProductUPC)
    hazards = models.ManyToManyField(Hazard)
    remedies = models.ManyToManyField(Remedy)
    remedy_options = models.ManyToManyField(RemedyOption)')