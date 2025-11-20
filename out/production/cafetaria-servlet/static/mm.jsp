
<html >
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Business Form</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-sm">
        <div class="card-body">
            <h4 class="mb-4">Business Details Form</h4>

            <form action="cafe" method="post">

                <div class="mb-3">
                    <label class="form-label">Name</label>
                    <input type="text" class="form-control" name="business_name" placeholder="Enter Name" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Location</label>
                    <input type="text" class="form-control" name="location" placeholder="Enter Location" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Type</label>
                    <input type="text" class="form-control" name="type" placeholder="Business Type" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Price</label>
                    <input type="number" class="form-control" name="price" placeholder="Enter Price" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Franchise Name</label>
                    <input type="text" class="form-control" name="franchise_name" placeholder="Franchise Name">
                </div>

                <div class="mb-3">
                    <label class="form-label">Owner Name</label>
                    <input type="text" class="form-control" name="owner_name" placeholder="Owner Name" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">GST No</label>
                    <input type="text" class="form-control" name="gst_no" placeholder="Enter GST Number">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>

            </form>

        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
