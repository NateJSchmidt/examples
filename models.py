from django.db import models
from django.contrib.auth.models import AbstractUser
from django.contrib.auth.validators import UnicodeUsernameValidator

from django.utils.translation import gettext_lazy as _


# Create your models here.
class User(AbstractUser):
    username = models.EmailField(
        _('username'),
        max_length=200,
        unique=True,
        help_text=_('Required. 200 characters or fewer. Letters, digits and @/./+/-/_ only.'),
        validators=[UnicodeUsernameValidator()],
        error_messages={
            'unique': _("A user with that email already exists."),
        },
    )


class Products(models.Model):
    name = models.TextField
    description = models.TextField
    model = models.TextField
    type = models.TextField
    category_id = models.TextField
    custom_category = models.CharField(max_length=2048, blank=True)
    number_of_units = models.TextField


class Injunctions(models.Model):
    url = models.TextField


class Images(models.Model):
    url = models.TextField


class Injuries(models.Model):
    name = models.TextField


class Manufacturers(models.Model):
    name = models.CharField(max_length=2048)
    company_id = models.TextField


class Retailers(models.Model):
    name = models.CharField(max_length=2048)
    company_id = models.TextField


class Importers(models.Model):
    name = models.CharField(max_length=2048)
    company_id = models.TextField


class Distributors(models.Model):
    name = models.CharField(max_length=2048)
    company_id = models.TextField


class ManufacturerCountry(models.Model):
    country = models.TextField


class ProductUPC(models.Model):
    upc = models.TextField


class Hazard(models.Model):
    name = models.TextField
    hazard_type = models.TextField
    hazard_type_id = models.TextField


class Remedy(models.Model):
    name = models.TextField


class RemedyOption(models.Model):
    options = models.TextField


class Recall(models.Model):
    recall_number = models.IntegerField
    recall_date = models.DateTimeField
    description = models.TextField
    url = models.TextField
    title = models.TextField
    consumer_contact = models.TextField
    last_publish_date = models.DateTimeField
    products = models.ManyToManyField(Products)
    injunctions = models.ManyToManyField(Injunctions)
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
    remedy_options = models.ManyToManyField(RemedyOption)

